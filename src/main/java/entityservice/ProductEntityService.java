package entityservice;

import dao.ProductDao;
import dto.ProductDetailDto;
import entity.Product;
import java.math.BigDecimal;
import java.util.List;


public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService() {
        productDao = new ProductDao();
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(Long id){
        return productDao.findById(id);
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllProductListByPriceGeAndPriceLe(priceGe, priceLe);
    }

    public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllProductListByPriceBetween(priceGe, priceLe);
    }

    public List<Product> findAllProductByCategoryBreakdown(Long breakdown){
        return productDao.findAllProductByCategoryBreakdown(breakdown);
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryBreakdown(Long breakdown) {
        return productDao.findAllProductDetailDtoByCategoryBreakdown(breakdown);
    }

}
