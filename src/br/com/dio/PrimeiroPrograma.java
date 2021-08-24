        package br.com.dio;

        import br.com.dio.model.gato;

        public class PrimeiroPrograma {
            public static void main(String[] args) {
                gato gato = new gato();
                System.out.println(gato);

                Livro livro = new Livro("Novo Livro", 100);
                System.out.println(livro);
            }
}
class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
        "nome='" + nome + '\'' +
        ", paginas=" + paginas +
        '}';
    }
}
