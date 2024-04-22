package com.mycompany.trabalhodesktop;

import com.mycompany.trabalhoDesktop.login;
import com.mycompany.trabalhoDesktop.login.LoginListener;

/**
 *
 * @author uelbe
 */
public class TrabalhoDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando e exibindo a tela de login
        login telaLogin = new login();
        telaLogin.setVisible(true);
        
        // Adicionando um listener para monitorar quando o login for bem sucedido
        telaLogin.addLoginListener(new LoginListener() {
            @Override
            public void onLoginSuccess() {
                // Abrir a tela de ordem de serviço quando o login for bem sucedido
                FrameOrdemServico frameOrdemServico = new FrameOrdemServico();
                frameOrdemServico.setVisible(true);
                
                // Fechar a tela de login
                telaLogin.dispose();
            }
        });
    }
    
}

