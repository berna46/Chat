import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.*;


enum State {INIT, OUTSIDE, INSIDE};

public class User{

  private String nickName;
  private SocketChannel sc;
  private State state;
  private String room;

  public User(String nickName, SocketChannel sc) {
   this.nickName = nickName;
   this.sc = sc;
   this.state = State.INIT;
   this.room = "";
 }

   public User(SocketChannel sc) {
    this.nickName = "";
    this.sc = sc;
    this.state = State.INIT;
    this.room = "";
  }

  public String getNickName() {
    return this.nickName;
  }

  public void setNickName(String n) {
    this.nickName = n;
  }

  public SocketChannel getSC() {
    return this.sc;
  }

  public State getState() {
    return this.state;
  }

  public void setState(State s) {
    this.state = s;
  }

  public String getRoom(){
    return this.room;
  }

  public void setRoom(String r){
    this.room = r;
  }

}
