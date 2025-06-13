import java.io.FileWriter; // Importa a classe para escrever em arquivos
import java.io.IOException; // Importa a classe para lidar com exceções de I/O
import java.io.PrintWriter; // Importa a classe para escrita formatada (opcional, mas útil)

public class SalvarEmTXT {

    public static void main(String[] args) {
        String nomeArquivo = "meuArquivo.txt"; // Define o nome do arquivo

        try {
            // Cria um FileWriter para escrever no arquivo.
            // O 'true' no construtor indica que o modo é 'append' (adicionar ao final do arquivo).
            // Se você quiser sobrescrever o arquivo toda vez, remova o 'true'.
            FileWriter fileWriter = new FileWriter(nomeArquivo);

            // Cria um PrintWriter para escrever linhas de texto de forma mais fácil.
            // Ele "embrulha" o FileWriter.
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escreve as linhas no arquivo
            printWriter.println("Olá, este é o meu primeiro texto!");
            printWriter.println("Estou guardando informações em um arquivo TXT.");
            printWriter.println("Data: 11 de Junho de 2025");
            printWriter.println("Mais uma linha de exemplo.");

            // É crucial fechar o PrintWriter (e o FileWriter) para garantir que todos os dados
            // sejam realmente gravados no arquivo e para liberar os recursos do sistema.
            printWriter.close();

            System.out.println("Dados salvos com sucesso em " + nomeArquivo);

        } catch (IOException e) {
            // Captura qualquer exceção de entrada/saída que possa ocorrer,
            // como problemas de permissão ou disco cheio.
            System.err.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
            e.printStackTrace(); // Imprime o rastreamento da pilha para depuração
        }
    }
}
