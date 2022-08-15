package com.etiya.northwind.business.abstracts;

import com.etiya.northwind.business.requests.CreateSupplierRequest;
import com.etiya.northwind.business.responses.SupplierListResponse;
import com.etiya.northwind.business.requests.UpdateSupplierRequest;
import com.etiya.northwind.core.utilities.result.DataResult;
import com.etiya.northwind.core.utilities.result.Result;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public interface SupplierService {
    DataResult<List<SupplierListResponse>>getAlL();
    DataResult<SupplierListResponse> getSupplierById(String supplierId);

    DataResult<SupplierListResponse> createSupplier(CreateSupplierRequest createSupplierRequest);

    Result deleteSupplierById(String supplierId);

    DataResult<SupplierListResponse> updateSupplier(String supplierId, UpdateSupplierRequest updateSupplierRequest);

    Map<String, Object> findByPageable(int page, int size);

    Map<String, Object> getAllPagesSupplierByEntity(int pageNumber, int pageSize, String property, String orElse);
}
