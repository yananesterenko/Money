package views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

import java.awt.event.ActionListener;


public class MainMenu {

    public MenuBar createMainMenue(){
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu catalogMenu = new Menu("Catalogs");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        MenuItem wallet = new MenuItem("Wallets");
        wallet.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                 WalletForm walletForm = new WalletForm();
                walletForm.createFormWallet();

            }
        });

        MenuItem cachFlowIncome = new MenuItem("Income items");
        MenuItem cachFlowOutgo = new MenuItem("Outgo items");
        MenuItem currency = new MenuItem("Currency");
        catalogMenu.getItems().addAll(wallet, cachFlowIncome, cachFlowOutgo,  currency);
        fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);
        mb.getMenus().addAll(fileMenu, catalogMenu);
        return mb;
    }





}
