/*
 
 */
package OOPM.Multithreading.StorageCounterPrinterThread;
////////////////////////////////////////////////////////////////////////////////
class Storage{
    int i;
    boolean Printed=true;
    //--------------------------------------------------------------------------
    public void setValue(int i){
        this.i=i;
    }
    //--------------------------------------------------------------------------
    public int getValue(){
        return i;
    }
    //--------------------------------------------------------------------------
    public boolean isPrinted(){
        return Printed;
    }
    //--------------------------------------------------------------------------
    public void setPrinted(boolean pValue){
        Printed=pValue;
    }
    //--------------------------------------------------------------------------
}
////////////////////////////////////////////////////////////////////////////////