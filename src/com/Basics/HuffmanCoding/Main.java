package com.Basics.HuffmanCoding;

public class Main {
    public static void main(String[] args) throws Exception{
        String str = "abbccda";
        HuffmanCoder hf = new HuffmanCoder(str);
        StringBuilder cs = hf.encoder(str);
        System.out.println(cs);
        String dc = hf.decoder(cs.toString());
        System.out.println(dc);
    }
}
