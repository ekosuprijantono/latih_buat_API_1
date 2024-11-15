package com.simple_api.simple_api2_crud.controller;

import com.simple_api.simple_api2_crud.model.Vendor;
import com.simple_api.simple_api2_crud.model.Goods;
import com.simple_api.simple_api2_crud.model.PurchHeader;
import com.simple_api.simple_api2_crud.model.PurchDetail;
import com.simple_api.simple_api2_crud.service.VendorService;
import com.simple_api.simple_api2_crud.service.GoodsService;
import com.simple_api.simple_api2_crud.service.PurchHeaderService;
import com.simple_api.simple_api2_crud.service.PurchDetailService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/API")
public class libraryAPIService {

        //Vendor dataVendor; --replaced by
        //Goods dataGoods;   --replaced by
        VendorService vendorService;
        GoodsService goodsService;
        PurchHeaderService purchHeaderService;
        PurchDetailService purchDetailService;


        public libraryAPIService(VendorService vendorService,GoodsService goodsService,PurchHeaderService purchHeaderService,PurchDetailService purchDetailService) {
            //this.dataGoods = dataVendor;  --replaced by
            this.vendorService = vendorService;
            //this.dataGoods = dataGoods;
            this.goodsService = goodsService;
            this.purchHeaderService = purchHeaderService;
            this.purchDetailService = purchDetailService;
        }

    //Vendor API
        @GetMapping("/vendor/{vendorId}")
        public Vendor getVendorDtls(@PathVariable("vendorId") String vendorId) {
            //return dataVendor;  --replaced by
            return vendorService.getVendor(vendorId);
        }

        @GetMapping("/vendor")
        public List<Vendor> getAllVendors() {
            //return dataVendor;  --replaced by
            return vendorService.getAllVendors();
        }

        @PostMapping("/vendor")
        public String createVendorDtl(@RequestBody Vendor dataVendor) {
            //this.dataVendor = dataVendor; --replaced by
            vendorService.createVendor(dataVendor);
            return "Vendor created !";
        }

        @PutMapping("/vendor")
        public String updateVendorDtl(@RequestBody Vendor dataVendor) {
            //this.dataVendor = dataVendor;  --replaced by
            vendorService.updateVendor(dataVendor);
            return "Vendor updated !";
        }

        @DeleteMapping("/vendor/{vendorId}")
        public String deleteVendorDtl(@PathVariable("vendorId") String vendorId) {
            //this.dataVendor = null;  --replaced by
            vendorService.deleteVendor(vendorId);
            return "Vendor deleted !";
        }

        /*sampe vendor json data :
        {
        "vendorId": "V02",
        "vendorName": "PT. AGI",
        "vendorAddress": "Jl. Cilandak",
        "vendorPhone": "022-877999"
        }
         */

    //goods API
        @GetMapping("/goods/{goodsId}")
        public Goods getGoodsDtls(@PathVariable("goodsId") String goodsId) {
            //return dataGoods;  //replaced by
            return goodsService.getGoods(goodsId);
        }

        @GetMapping("/goods")
        public List<Goods> getAllGoodsDtls() {
            //return dataGoods;  //replaced by
            return goodsService.getAllGoods();
        }

        @PostMapping("/goods")
        public String createGoodsDtl(@RequestBody Goods dataGoods) {
            //this.dataGoods = dataGoods; //replaced by
            goodsService.createGoods(dataGoods);
            return "Goods created !";
        }

        @PutMapping("/goods")
        public String updateGoodsDtl(@RequestBody Goods dataGoods) {
            //this.dataGoods = dataGoods;  //replaced by
            goodsService.updateGoods(dataGoods);
            return "Goods updated !";
        }

        @DeleteMapping("/goods/{goodsId}")
        public String deleteGoodsDtl(@PathVariable("goodsId") String goodsId) {
            //this.dataGoods = null;  //replaced by
            goodsService.deleteGoods(goodsId);
            return "Goods deleted !";
        }

        /*
        *sampe goods json data :
        {
        "goodsId": "Z01",
        "goodsName": "Pupuk Urea",
        "goodsCategory": "Pupuk",
        }
         */

    //Purchase Header API
        @GetMapping("/purchaseH/{purchId}")
        public PurchHeader getPurchHeaderDtls(@PathVariable("purchId") String purchId) {
            return purchHeaderService.getPurchHeader(purchId);
        }

        /*@GetMapping("/purchaseH")
        public List<Vendor> getAllPurchHeaderDtls() {
            return purchHeaderService.getAllPurchHeader();
        }*/

        @PostMapping("/purchaseH")
        public String createPurchHeaderDtl(@RequestBody PurchHeader dataPurchHeader) {
            purchHeaderService.createPurchHeader(dataPurchHeader);
            return "purchase Header created !";
        }

        @PutMapping("/purchaseH")
        public String updatePurchHeaderDtl(@RequestBody PurchHeader dataPurchHeader) {
            purchHeaderService.updatePurchHeader(dataPurchHeader);
            return "Purchase Header updated !";
        }

        @DeleteMapping("/purchaseH/{purchId}")
        public String deletePurchHeaderDtl(@PathVariable("purchId") String purchId) {
            purchHeaderService.deletePurchHeader(purchId);
            return "Purchase Header deleted !";
        }
            /*sampe vendor json data :
            {
                "purchId": "P002",
                "phvendorId": "V02",
                "purchDesc": "TEST LAGI",
                "puchDate": "2024-11-08"
            }
             */

    //Purchase Detail API
        @GetMapping("/purchaseD/{purchdtlId}")
        public PurchDetail getPurchDetailDtls(@PathVariable("purchdtlId") String purchdtlId) {
            return purchDetailService.getPurchDetail(purchdtlId);
        }


            /*@GetMapping("/purchaseH")
            public List<Vendor> getAllPurchDetailDtls() {
                return purchDetailService.getAllPurchDetail();
            }*/

        @PostMapping("/purchaseD")
        public String createPurchDetailDtl(@RequestBody PurchDetail dataPurchDetail) {
            purchDetailService.createPurchDetail(dataPurchDetail);
            return "purchase Detail created !";
        }

        @PutMapping("/purchaseD")
        public String updatePurchDetailDtl(@RequestBody PurchDetail dataPurchDetail) {
            purchDetailService.updatePurchDetail(dataPurchDetail);
            return "Purchase Detail updated !";
        }

        @DeleteMapping("/purchaseD/{purchdtlId}")
        public String deletePurchDetailDtl(@PathVariable("purchdtlId") String purchdtlId) {
            purchDetailService.deletePurchDetail(purchdtlId);
            return "Purchase Detail deleted !";
        }
                /*sampe vendor json data :
                {
                    "purchId": "P002",
                    "phvendorId": "V02",
                    "purchDesc": "TEST LAGI",
                    "puchDate": "2024-11-08"
                }
                 */






}
