package task4;

public class ProDocumentWorker extends DocumentWorker {

    public void editDocument(){
        System.out.println("Документ отредактирован");
    }
    public void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах\n" +
                "доступно в версии Эксперт");
    }
}
