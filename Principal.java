public class Principal {
    public static void main(String[] args) {
     Aluno a=new Aluno();
     Professor p=new Professor();
     System.out.println("Adicionando Aluno");
     System.out.println(a.adicionar());   
     System.out.println(a.excluir());
     System.out.println(a.pesquisar());

     System.out.println("Adicionando Professor");
     System.out.println(p.adicionar());   
     System.out.println(p.excluir());
     System.out.println(p.pesquisar());
    }
}
