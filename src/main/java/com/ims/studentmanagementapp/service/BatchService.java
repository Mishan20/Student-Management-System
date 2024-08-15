package com.ims.studentmanagementapp.service;

import com.ims.studentmanagementapp.dto.BatchDTO;
import com.ims.studentmanagementapp.dto.BatchSaveDTO;
import com.ims.studentmanagementapp.dto.BatchUpdateDTO;

import java.util.List;

public interface BatchService {

    String addBatch(BatchSaveDTO batchSaveDTO);
    List<BatchDTO> getAllBatches();
    String updateBatch(BatchUpdateDTO batchUpdateDTO);
    boolean deleteBatch(int id);
}
