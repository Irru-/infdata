/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.science.pkg2016;

/**
 *
 * @author nick
 */
public class UserPreference {
    
    private int         article;
    private double      rating;
    
    public UserPreference(int article, double rating) {
        setArticle(article);
        setRating(rating);
    }
    
    public void setArticle(int article){
        this.article = article;
    }
    
    public void setRating(double rating){
        this.rating  = rating;
    }
    
    public int getArticle(){
        return article;
    }
    
    public double getRating(){
        return rating;
    }
            
}
