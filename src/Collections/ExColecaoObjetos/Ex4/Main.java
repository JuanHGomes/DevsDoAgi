package Collections.ExColecaoObjetos.Ex4;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Juan", "1234567", "juan@yahoo.com");
        Contato contato2 = new Contato("Erick", "1234568", "Erick@yahoo.com");
        Contato contato3 = new Contato("Nelson", "1234569", "Nelson@yahoo.com");
        Contato contato4 = new Contato("Nelson", "1234560", "Nelson@yahoo.com");

        Contato[] contatos = new Contato[]{contato1,contato2,contato3, contato4};

        for(Contato contato : contatos){
            Contato.adicionarContato(contato);
        }

        Contato.converterSetEmList();
        Contato.exibirContatos();

    }

}
