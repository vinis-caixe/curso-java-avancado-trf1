package br.cnj.segundo_projeto.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.cnj.segundo_projeto.config.QueueConfig;
import br.cnj.segundo_projeto.model.entities.Caixa;

@Component
public class Consumer {
    
    @RabbitListener(queues = {QueueConfig.NOME_FILA})
    public void receive(@Payload String fileBody) {
        System.out.println("RECEBI ESSA MENSAGEM: " + fileBody);
    }

    @RabbitListener(queues = {QueueConfig.NOME_FILA})
    public void receive(@Payload Caixa fileBody) {
        System.out.println("Caixa Recebido: " + fileBody.getNm_caixa() + fileBody.getDs_caixa());
    }
}
