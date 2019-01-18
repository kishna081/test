package com.internousdev.login.dto;

public class LoginDTO {
  private int id;
  private String name;
  private String password;

  public int getId(){
	  return id;
  }

  public void setId(int id){
	  this.id=id;
  }

  public String getName(){
	  return name;
  }

  public void setName(String name){
	  this.name=name;
  }

  public String setPassword(){
	  return password;
  }

  public void getPassword(String password){
	  this.password=password;
  }


}
