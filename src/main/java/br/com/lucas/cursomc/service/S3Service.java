package br.com.lucas.cursomc.service;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class S3Service {
	
	@Autowired
	private AmazonS3 s3client;
	
	@Value("${s3.bucket}")
	private String bucketName;
	
	private Logger LOG = LoggerFactory.getLogger(S3Service.class);
	
	public void uploadFile(String localFilePath) {
		
		try {
		System.out.println("Upload Iniciado");	
		File file = new File(localFilePath);
		s3client.putObject(new PutObjectRequest(bucketName, "teste", file));
		System.out.println("Upload Finilizado");
		} catch (AmazonServiceException e) {
			LOG.info("AmazonServiceException: " + e.getErrorCode());
			LOG.info("status: " + e.getErrorCode());
		} catch (AmazonClientException e) {
			LOG.info("AmazonClienteException: " + e.getMessage());
			
		}
	}
	
}
