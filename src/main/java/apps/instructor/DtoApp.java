package apps.instructor;

import dto.ProductDetailDto;
import entityservice.ProductEntityService;
import java.util.List;


public class DtoApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<ProductDetailDto> productList = service.findAllProductDetailDtoByCategoryBreakdown(3L);

        for (ProductDetailDto productDetailDto : productList) {
            System.out.println(productDetailDto);
        }
    }
}
