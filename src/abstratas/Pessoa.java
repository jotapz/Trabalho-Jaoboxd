package abstratas;

public abstract class Pessoa {
        protected String nome;


        public Pessoa(String nome){
            this.nome = nome;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "abstratas.Pessoa{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
    }


