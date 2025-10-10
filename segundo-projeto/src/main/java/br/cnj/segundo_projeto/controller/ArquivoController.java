package br.cnj.segundo_projeto.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/arquivo")
public class ArquivoController {
    private static final String DIR_UPLOAD = "uploads/";
    private static final String DIR_DOWNLOAD = "downloads/";

    @PostMapping("/upload")
    public ResponseEntity<String> uploadArquivo(@RequestParam("file") MultipartFile file) {
        if(file.isEmpty()) {
            return new ResponseEntity<String>("Selecione um arquivo para fazer upload", HttpStatus.BAD_REQUEST);
        }

        try{
            byte[] bytes = file.getBytes();
            Path path = Paths.get(DIR_UPLOAD + file.getOriginalFilename());
            Files.write(path, bytes);
            return new ResponseEntity<String>("Arquivo carregado com sucesso", HttpStatus.OK);
        } catch(IOException e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Falha ao fazer upload do arquivo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/uploads")
    public ResponseEntity<String> handleFileUpload(@RequestParam("files") List<MultipartFile> files) {
        if(files.isEmpty()) {
            return new ResponseEntity<String>("Selecione um ou mais arquivos para fazer upload", HttpStatus.BAD_REQUEST);
        }

        try{
            for(MultipartFile file : files) {
                if(file.isEmpty()) {
                    return new ResponseEntity<String>("Um ou mais arquivos estão vazios", HttpStatus.BAD_REQUEST);
                }
                byte[] bytes = file.getBytes();
                Path path = Paths.get(DIR_UPLOAD + file.getOriginalFilename());
                Files.write(path, bytes);
            }

            return new ResponseEntity<>("Arquivos carregados com sucesso", HttpStatus.OK);
        } catch(IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Falha ao fazer upload dos arquivos", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/download/{filename}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable("filename") String filename) {
        try {
            Path filePath = Paths.get(DIR_DOWNLOAD + filename);
            byte[] fileBytes = Files.readAllBytes(filePath);
            return ResponseEntity.ok()
                .header("Content-Disposition", "attachment; filename=\""+ filename + "\"")
                .body(fileBytes);
        } catch(IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
