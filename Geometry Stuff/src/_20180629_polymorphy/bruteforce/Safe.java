package _20180629_polymorphy.bruteforce;

import java.util.Arrays;

public class Safe {
    private char[] password;

    public Safe(char[] password) {
    	this.password = password;
    }

    public boolean open(char[] passwordToTry) {
    	return Arrays.equals(this.password, passwordToTry);
    }
    
    public char[] getPassword() {
    	return password;
    }
    
    public void setPassword(char[] password) {
    	this.password = password;
    }
}