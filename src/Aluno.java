
public class Aluno {
   private String nome;
   private int mat;
   private float nota;
   private Aluno proximo;

    public Aluno() {
    }
   
    public Aluno(String nome, int mat, float nota , Aluno proximo) {
        this.nome = nome;
        this.mat = mat;
        this.nota = nota;
        this.proximo = proximo;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Aluno getProximo() {
        return proximo;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return String.format("O aluno = %s, com matricula = %d, tem nota = %.0f ", nome, mat, nota);
    }
    
}
