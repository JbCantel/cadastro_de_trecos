package com.cantel.cadastro_de_trecos.crud;

import static com.cantel.cadastro_de_trecos.Cadastro_de_trecos.clearScreen;
import static com.cantel.cadastro_de_trecos.Cadastro_de_trecos.mainMenu;
import static com.cantel.cadastro_de_trecos.crud.Read.read;
import com.cantel.cadastro_de_trecos.db.DbConnection;
import com.cantel.cadastro_de_trecos.setup.AppSetup;
import java.lang.reflect.Array;
import java.sql.SQLException;

public class Delete extends AppSetup {

    public static void delete() {
        // Reserva recursos para o banco de dados.
        int id = 0;
        String sql = "";

        // Cabeçalho da seção.
        System.out.println(appName + "\n" + appSep);
        System.out.println("Apaga um registro");
        System.out.println(appSep);

        try {

            // Recebe o Id do teclado.
            System.out.print("Digite o ID ou [0] para retornar: ");
            // Recebe o id pelo teclado
            id = Integer.parseInt(scanner.next());
            // Testa o id.
            if (id == 0) {
                clearScreen();
                mainMenu();
            }
        } catch (NumberFormatException e) {
            // Quando opção é inválida.
            clearScreen();
            System.out.println("Oooops! Opção inválida!\n");
            delete();
        }

        try {

            sql = "SELECT * FROM " + DBTABLE + " WHERE id = ?";
            conn = DbConnection.dbConnect();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            res = pstm.executeQuery();

            if (res.next()) {
            } else {
                clearScreen();
                System.out.println("Oooops! Não achei nada!");
                delete();
            }

        } catch (SQLException error) {
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }

    }

}
