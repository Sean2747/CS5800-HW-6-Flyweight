package org.example;
public class File {
    public Document doc = new Document();
    public File() {}
    public void saveToFile(Document doc){
        this.doc = doc.cloneDocument();
    }

    public Document loadFromFile(){
        return doc.cloneDocument();
    }
}
