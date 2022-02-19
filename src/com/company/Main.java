package com.company;

public class Main {

    public static void main(String[] args) {
                int n=6;
                for(int i=0;i<n;i++)
                {
                    for(int k=5;k>=i;k--)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i=5;i>=0;i--)
                {
                    for(int k=3;k>i;k--)
                    {
                        System.out.print(" ");
                    }
                    for(int j=0;j<i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }