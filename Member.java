
package TokoOnline;

import java.util.ArrayList;
public class Member implements User{

 private ArrayList<String> namaMember = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> saldo = new ArrayList<Integer>();

 public Member() {
 this.namaMember.add("abdul");
 this.alamat.add("pakis");
 this.telepon.add("0833672999189");
 this.saldo.add(150000);

 this.namaMember.add("soni");
 this.alamat.add("gadang");
 this.telepon.add("0812234588814");
 this.saldo.add(300000);
 }
 public void setSaldo(int saldo){
 this.saldo.add(saldo);
 }
 public int getSaldo(int idMember){
 return this.saldo.get(idMember);
 }
 public void editSaldo(int idMember, int saldo){
 this.saldo.set(idMember, saldo);;
 }
 public int getJmlMember(){
 return this.saldo.size();
 }
 @Override
 public void setNama(String namaMember ){
 this.namaMember.add(namaMember);
 }

 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }

 @Override
 public String getNama(int idMember){
 return this.namaMember.get(idMember);
 }

 @Override
 public String getAlamat(int idMember){
 return this.alamat.get(idMember);
 }

 @Override
 public String getTelepon(int idMember){
 return this.telepon.get(idMember);
 }
}