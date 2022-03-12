package net.phumyreal.nhadatphumybackend.services;

import net.phumyreal.nhadatphumybackend.models.EstateVO;

import java.util.HashMap;
import java.util.List;

public interface EstateService {
    public void insertEstate(EstateVO vo);
    public void updateEstate(EstateVO vo);
    public void deleteEstate(long estateVOId);
    public List<EstateVO> selectEstate(HashMap<String, Object> data);
    public EstateVO selectEstateById(long estateVOId);
}
