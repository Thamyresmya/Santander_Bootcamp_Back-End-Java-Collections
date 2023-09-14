package Set.Pesquisa.atividade;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //METODOS
    //Adiciona um contato à agenda.
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    //Exibe todos os contatos da agenda.
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    //Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    //Atualiza o número de telefone de um contato específico.
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    //TESTES
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        System.out.println("Exibindo os contatos no conjunto");
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        System.out.println("\nExibindo os contatos na agenda");
        agendaContatos.exibirContatos();

        System.out.println("\nPesquisando contatos pelo nome");
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("\nAtualizando o número de um contato");
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("\nExibindo os contatos atualizados na agenda");
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}