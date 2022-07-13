import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JerseyPojo {

    public static HashMap<Long,JerseyPojo> jerseyMap=new HashMap<>();
    private static long modelID=10000;
    private String modelName;
    private String modelType;

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    private int jerseyPrice;

    private int totalStock;

    private List<String> modelSize=new ArrayList<>();

    public List<String> getModelSize() {
        return modelSize;
    }

    public void setModelSize(List<String> modelSize) {
        this.modelSize = modelSize;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public long getModelID() {
        return modelID;
    }

    public void setModelID(long modelID) {
        this.modelID = modelID;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getJerseyPrice() {
        return jerseyPrice;
    }

    public void setJerseyPrice(int jerseyPrice) {
        this.jerseyPrice = jerseyPrice;
    }

    public JerseyPojo(Long modelID, String modelName,int jerseyPrice,String modelType,List<String> modelSize,int totalStock){
        this.modelID=modelID++;
        this.modelName=modelName;
        this.jerseyPrice=jerseyPrice;
        this.modelType=modelType;
        this.modelSize=modelSize;
        this.totalStock=totalStock;
    }
    public JerseyPojo(){

    }

    @Override
    public String toString() {
        return "JerseyPojo{" +
                "modelName='" + modelName + '\'' +
                ", modelType='" + modelType + '\'' +
                ", jerseyPrice=" + jerseyPrice +
                ", totalStock=" + totalStock +
                ", modelSize=" + modelSize +
                '}';
    }
}
