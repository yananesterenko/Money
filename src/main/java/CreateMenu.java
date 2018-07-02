import javafx.scene.control.*;


public class CreateMenu {

    public MenuBar createMainMenue(){
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu catalogMenu = new Menu("Catalogs");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        MenuItem pouch = new MenuItem("Pouches");
        MenuItem cachFlowIncome = new MenuItem("Income items");
        MenuItem cachFlowOutgo = new MenuItem("Outgo items");
        MenuItem currency = new MenuItem("Currency");
        catalogMenu.getItems().addAll(pouch, cachFlowIncome, cachFlowOutgo,  currency);
        fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);
        mb.getMenus().addAll(fileMenu, catalogMenu);
        return mb;
    }

}
