package PatterFactory;

public class IcmsFactory {
    public CauculoPorRegiao getIcmsPorEstado(String NomeEstado){
        if (NomeEstado.equalsIgnoreCase("ICMS_MG")){
            return new IcmsMG();
        } else if (NomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return new IcmsSP();
        } else if (NomeEstado.equalsIgnoreCase("RJ")) {
            return new IcmsRJ();
        } else if (NomeEstado.equalsIgnoreCase("ICMS_ES")) {
            return new IcmsES();
        }else {
            System.out.println("valor inválido - ICMS não cadastrado");
            return null;
        }
    }
}
