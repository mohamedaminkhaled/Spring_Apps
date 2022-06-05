package com.sourcing.sql_services;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourcing.sql_models.CrawlingResults;
import com.sourcing.sql_repository.CrawlingResultsRepo;

import au.com.bytecode.opencsv.CSVReader;

@Service
public class CrawlingResultsService {
	
	@Autowired
	private CrawlingResultsRepo crepo;
	
	String line = "";
	int index = 0;
	
	
	public void saveCrawlingResults(String filePath) {
		try {
			List<List<String>> records = new ArrayList<List<String>>();
			try (CSVReader csvReader = new CSVReader(new FileReader(filePath));) {
			    String[] values = null;
			    while ((values = csvReader.readNext()) != null) {
			        records.add(Arrays.asList(values));
			    }
			}
			
			for (List<String> record : records) {
				String [] data = record.get(0).split("\t");
				CrawlingResults cr = new CrawlingResults();
				
				if(index == 0) {
					index ++;
					continue;
				}
				
				if(data.length <= 1) {
					continue;
				}
				
				cr.setSource_name(data[0]);
				cr.setSource_id(data[1]);
				cr.setItem(data[2]);
				cr.setName(data[3]);
				cr.setPrice(data[4]);
				cr.setCondition(data[5]);
				cr.setRating(data[6]);
				cr.setImage_src(data[7]);
				cr.setItemurl(data[8]);
				cr.setFeature_name(data[9]);
				cr.setFeature_value(data[10]);
				crepo.save(cr);
			}
			
//			BufferedReader br = new BufferedReader(new FileReader(filePath));
//			while((line = br.readLine()) != null) {
//				if(index == 0) {
//					index ++;
//					continue;
//				}
//				
//				String [] data = line.split("\t");
//				if(data.length <= 1) {
//					continue;
//				}
//				CrawlingResults cr = new CrawlingResults();
//				
//				cr.setSource_name(data[0]);
//				cr.setSource_id(data[1]);
//				cr.setItem(data[2]);
//				cr.setName(data[3]);
//				cr.setPrice(data[4]);
//				cr.setCondition(data[5]);
//				cr.setRating(data[6]);
//				cr.setImage_src(data[7]);
//				cr.setItemurl(data[8]);
//				cr.setFeature_name(data[9]);
//				cr.setFeature_value(data[10]);
//				crepo.save(cr);
				
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addItem(CrawlingResults newItem) {
		crepo.save(newItem);
	}
	
	public List<CrawlingResults> getByItem(String item) {
		return crepo.findByItem(item);
	}
	
}









