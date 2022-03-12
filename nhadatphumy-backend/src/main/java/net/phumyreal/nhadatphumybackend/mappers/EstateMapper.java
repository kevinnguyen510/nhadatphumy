package net.phumyreal.nhadatphumybackend.mappers;

import net.phumyreal.nhadatphumybackend.models.EstateVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface EstateMapper {
    public int insertEstate(EstateVO vo);
    public int updateEstate(EstateVO vo);
    public int deleteEstate(long estateId);
    public List<EstateVO> selectEstate(HashMap<String, Object> data);
    public EstateVO selectEstateById(long estateId);
}
