package com.leyou.item.pojo;

import javax.persistence.Transient;
import java.util.List;

public class SpuVo extends Spu{

    private String cname; //商品分类名称

    private String bname; //商品名称

    @Transient
    private SpuDetail spuDetail;

    @Transient
    List<Sku> skus;// sku列表

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public SpuDetail getSpuDetail() {
        return spuDetail;
    }

    public void setSpuDetail(SpuDetail spuDetail) {
        this.spuDetail = spuDetail;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }
}
