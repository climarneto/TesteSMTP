/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 *
 * @author cneto
 */
public class UtilitarioEmail {

    public void enviaEmailHtml(EmailAEnviar mail, ServidorSmtp servidor) throws EmailException, MalformedURLException {
        ServidorSmtp s = new ServidorSmtp();
        s = servidor;
        HtmlEmail email = new HtmlEmail();
        //adiciona uma imagem ao corpo da mensagem e retorna seu id
        //URL url = new URL ("http://www.apache.org/images/asf_logo_wide.gif");
        //String cid = email.embed(url, "Apache logo");

        //configura a mensagem para formato HTML
        //email.setHtmlMsg("<html>Hospital Unimed Costa do Sol</html>");
        //configure uma mensagem alternativa caso o servidor não suporte HTML
        email.setTextMsg("Seu servidor de email não suporte mensagem HTML");

        email.setHostName(s.getServidor()); //setando Servidor SMTP
        email.addTo(mail.getDestinatario().getEmail(), mail.getDestinatario().getNome()); //setando destinatário
        email.setFrom(mail.getRemetente().getEmail(), mail.getRemetente().getNome()); //setando remetente
        email.setSubject(mail.getTitulo()); //setando assunto
        email.setMsg(mail.getMensagem()); //setando conteúdo do email
        email.setAuthentication(s.getUsuario(), s.getSenha()); //setando autenticação
        if (s.isUtilizaSsl() == false) {
            email.setSmtpPort(s.getPorta()); //setando a porta de envio do servidor SMTP
        }
        if (s.isUtilizaTls()) {
            email.setTLS(s.isUtilizaTls());
        }
        if (s.isUtilizaStartTls()) {
            email.setStartTLSEnabled(s.isUtilizaStartTls());
        }
        if (s.isUtilizaStartTlsRequired()) {
            email.setStartTLSRequired(s.isUtilizaStartTlsRequired());
        }
        if (s.isUtilizaSsl()) {
            email.setSslSmtpPort(Integer.toString(s.getPorta()));
            email.setSSL(s.isUtilizaSsl());
        }

        //envia email
        email.send();
    }

}
