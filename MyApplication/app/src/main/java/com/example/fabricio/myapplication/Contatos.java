package com.example.fabricio.myapplication;

import java.io.Serializable;

/**
 * Created by Fabrício Natanael on 27/04/2016.
 */
public class Contatos implements Serializable {



        private String id;

        private String nome;

        private String telefone;

        private String imagem;

        public Contatos() {
        }

        public Contatos(String nome, String telefone, String imagem) {
            this.nome = nome;
            this.telefone = telefone;
            this.imagem = imagem;
        }

        public Contatos(String id, String nome, String telefone, String imagem) {
            this.nome = nome;
            this.telefone = telefone;
            this.imagem = imagem;
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImagem() {
            return imagem;
        }

        public void setImagem(String imagem) {
            this.imagem = imagem;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

}
