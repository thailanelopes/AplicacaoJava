    package br.com.thailanelopes.todolist.controller;

    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class PrimeiraRotaController {

        /**
         * GET - Buscar uma informação
         * POST - Adicionar um dado/informação
         * PUT - Alterar um dado/informação
         * DELETE - Remover um dado
         * PATCH - Alterar somente uma parte do dado/informação
         * 
         */

        public String primeiraMensagem() {
        return "Funcionou";
        }
        
    }
