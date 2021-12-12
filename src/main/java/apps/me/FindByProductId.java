package apps.me;

import dto.ProductCommentDetailDto;
import entityservice.ProductCommentEntityService;
import java.util.List;


public class FindByProductId {
    public static void main(String[] args) {

        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<ProductCommentDetailDto> productCommentDetailDtoList = productCommentEntityService.findAllCommentByProductId(2L);

        for (ProductCommentDetailDto productCommentDetailDto : productCommentDetailDtoList) {
            System.out.println(productCommentDetailDto);
        }
    }
}
