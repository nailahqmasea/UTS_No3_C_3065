/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3065;

/**
 *
 * @author Nailah Qothrunnada Maryana Septeardi
 * NIM : 21103065
 * UTS 2022 No.3
 */
public class StudentStaff_3065 extends Mahasiswa_3065{
    int unitKerja, jamKerja;
    
    public double totalPendapatan(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff(){
        super.tampilDataMhs();
        System.out.println(" Unit Kerja : " + unitKerja);
        System.out.println(" Jam Kerja : " +jamKerja);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan());
    }
}
