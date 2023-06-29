package Book;

public class AbstractionBook {
    private int id;
    private String name,author;


    public  AbstractionBook(int aId,String aName,String anAuthor){
        setId(aId);
        setName(aName);
        setAuthor(anAuthor);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String Introduce(){
        return "这本书叫《"+name+"》，它的作者是："+author+"  当前对应ID是："+id;
    }


}
