package com.ims.studentmanagementapp.service.IMPL;

import com.ims.studentmanagementapp.dto.BatchDTO;
import com.ims.studentmanagementapp.dto.BatchSaveDTO;
import com.ims.studentmanagementapp.dto.BatchUpdateDTO;
import com.ims.studentmanagementapp.entity.Batch;
import com.ims.studentmanagementapp.repo.BatchRepo;
import com.ims.studentmanagementapp.repo.CourseRepo;
import com.ims.studentmanagementapp.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchServiceIMPL implements BatchService {

    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private BatchRepo batchRepo;
    @Override
    public String addBatch(BatchSaveDTO batchSaveDTO) {
        Batch batch = new Batch(
                batchSaveDTO.getBatchname(),
                batchSaveDTO.getStartdate(),
                courseRepo.getById(batchSaveDTO.getCourseid())
        );
        batchRepo.save(batch);
        return batch.getBatchname();
    }
    @Override
    public List<BatchDTO> getAllBatches() {
        List<Batch> getBatches = batchRepo.findAll();
        List<BatchDTO> batchDTOList = new ArrayList<>();
        for(Batch batch:getBatches)
        {
            BatchDTO batchDTO = new BatchDTO(
                    batch.getBatchid(),
                    batch.getBatchname(),
                    batch.getCourse(),
                    batch.getStartdate()
            );
            batchDTOList.add(batchDTO);
        }
        return batchDTOList;
    }
    @Override
    public String updateBatch(BatchUpdateDTO batchUpdateDTO) {
        if(batchRepo.existsById(batchUpdateDTO.getBatchid()))
        {
            Batch batch = batchRepo.getById(batchUpdateDTO.getBatchid());
            batch.setBatchname(batchUpdateDTO.getBatchname());
            batch.setCourse(courseRepo.getById(batchUpdateDTO.getCourseid()));
            batch.setStartdate(batchUpdateDTO.getStartdate());
            batchRepo.save(batch);
            return batch.getBatchname();
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return null;
    }
    @Override
    public boolean deleteBatch(int id) {
        if(batchRepo.existsById(id))
        {
            batchRepo.deleteById(id);
        }
        else
        {
            System.out.println("Course ID Not Found");
        }
        return false;
    }
}
