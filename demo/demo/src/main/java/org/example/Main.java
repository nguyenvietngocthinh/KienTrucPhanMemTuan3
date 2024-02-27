package org.example;

//import jdepend.swingui.JDepend;
//import  jdepend.textui.JDepend;
import jdepend.xmlui.JDepend;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        JDepend depend = new JDepend();
        // path directory
        String prjDir = "T:\\20065261_NguyenVietNgocThinh_THTuan3n3";
        depend.addDirectory(prjDir);
        // analyze
        depend.analyze();
    }
}