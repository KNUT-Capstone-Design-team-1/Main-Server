package capstone.pill.dto;

import lombok.Data;

@Data
public class ApiResponseDto {
    private String effect;
    private String dosage;
    private String caution;

    private String drug_name_r; //약 이름
    private String drug_img; //약 이미지
    private String drug_info; // 약 복약정보
    private String drug_Manufacturer; // 약 제조사
    private String drug_Additives; // 약 첨가제
}
