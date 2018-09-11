package persons;

import java.util.*;


public class Person {

   private long id;

   private long version;

   private String firstName;

   private String lastName;

   private Calendar birthDay;

   private GenderType gender;

   private byte[] picture;


   private String comment;

   private boolean married;

   private String homepage;

   public long getId() {
      return id;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public long getVersion() {
      return version;
   }

   public Calendar getBirthDay() {
      return birthDay;
   }

   public void setBirthDay(Calendar birthDay) {
      this.birthDay = birthDay;
   }

   public GenderType getGender() {
      return gender;
   }

   public void setGender(GenderType gender) {
      this.gender = gender;
   }

   public byte[] getPicture() {
      return picture;
   }

   public void setPicture(byte[] picture) {
      this.picture = picture;
   }

   public String getComment() {
      return comment;
   }

   public void setComment(String comment) {
      this.comment = comment;
   }

   public boolean isMarried() {
      return married;
   }

   public void setMarried(boolean married) {
      this.married = married;
   }

   public int getAge() {
      Calendar today = new GregorianCalendar();
      return today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
   }

   public String getHomepage() {
      return homepage;
   }

   public void setHomepage(String homepage) {
      this.homepage = homepage;
   }

}
