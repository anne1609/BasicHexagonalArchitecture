/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author ZenBook
 */

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
   public String getTitle(){
       return title;
   }
   public String getAuthor(){
       return author;
   }

   public void setId(int bookID){
       this.id=bookID;
   }
}
