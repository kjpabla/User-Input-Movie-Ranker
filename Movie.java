package testing;

import priority.*;
/* COSC 1P03
 * ASSIGNMENT #3
 * Name: (Karanjot Pabla)
 * Student #: (6231377)
 */
public class Movie implements Prioritized<Movie> {
 private String title;
 private double rating;
 private String year;
 
 public Movie(String title, String year, double rating) {
  this.title=title;
  this.year=year;
  this.rating=rating;
 }
 
 public int compareTo(Movie other) {
   return (int)(this.rating-other.getRating());
  
 }
 
 public double changeRating(double newRating) {
  return (-1*(rating-(rating=newRating)));
 }
 
 public String getTitle() {
  return title;
 }
 
 public String getYear() {
  return year;
 }
 
 public double getRating() {
  return rating;
 }
 
 public String getKey() {
  return title+" ("+year+")";
 }
 
 public double getPriority() {
  return getRating();
 }
 
 public double changePriority(double newP) {
  return changeRating(newP);
 }
 
 
}
