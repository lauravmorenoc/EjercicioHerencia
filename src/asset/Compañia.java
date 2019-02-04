/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lamorenoca
 */
public class Compañia {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Cliente> clientes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }

    public HashMap<Integer, Cliente> getClientes() {
        return clientes;
    }
    
    public void addShareAsset(String symbol, double totalCost, double currentPrice){
        ShareAsset =new ShareAsset(symbol, totalCost, currentPrice);
        assets.add(e);
    }
    public void addStockAsset(String symbol, double totalCost, double currentPrice, int totalShares){
        
    }
    
    public void addMutualFondAsset(String symbol, double totalCost, double currentPrice, double totalShares){
        
    }
    
    public void addCashAsset(String symbol, double totalCost, double currentPrice, double amount){
        
    }
    
    public void addDividendStockAsset(String symbol, double totalCost, double currentPrice, int totalShares, double dividends){
        
    }
    
    public void añadirCliente(String nombre, String apellido, int telefono, int edad, String email, ArrayList<Asset> activos){
        
    }

    public double getAllMarketValue(){
        double marketValue=0;
        for(Cliente cliente: clientes.values()){
            for(Asset asset : cliente.getActivos()){
                marketValue+=asset.getMarketValue();
            }
        }
        return marketValue;
    }
    
    public double[] getMarketValueByAssetType(){
        double[] marketValues=new double[5];
        for(Asset asset : this.getAssets()){
            if(asset instanceof Cash){
                marketValues[0]+=asset.getMarketValue();
            }
            if(asset instanceof ShareAsset){
                marketValues[1]+=asset.getMarketValue();
            }
            if(asset instanceof Stock){
                marketValues[2]+=asset.getMarketValue();
            }
            if(asset instanceof MutualFund){
                marketValues[3]+=asset.getMarketValue();
            }
            if(asset instanceof DividendStock){
                marketValues[4]+=asset.getMarketValue();
            }
        }
        return marketValues;
    }
    
    public double getAllProfitValue(){
        double profitValue=0;
        for(Asset asset : this.getAssets()){
            profitValue+=asset.getProfit();
        }
        return profitValue;
    }
    
    
    
    public Compañia(String name) {
        this.name = name;
        this.assets=new ArrayList<>();
        this.clientes=new HashMap<>();
    }
   
    
    
    public static void main(String[] args) {
        
    }
}
