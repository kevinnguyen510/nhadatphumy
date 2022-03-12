package net.phumyreal.nhadatphumybackend.services;

import net.phumyreal.nhadatphumybackend.mappers.EstateMapper;
import net.phumyreal.nhadatphumybackend.models.EstateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service(value = "estateService")
public class EstateServiceImp implements EstateService{
    @Autowired
    EstateMapper estateMapper;

    @Override
    public void insertEstate(EstateVO vo) {

    }

    @Override
    public void updateEstate(EstateVO vo) {

    }

    @Override
    public void deleteEstate(long estateVOId) {

    }

    @Override
    public List<EstateVO> selectEstate(HashMap<String, Object> data) {
        return estateMapper.selectEstate(data);
    }

    @Override
    public EstateVO selectEstateById(long estateVOId) {
        return null;
    }
}
