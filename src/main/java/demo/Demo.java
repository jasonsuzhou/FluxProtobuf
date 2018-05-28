package demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

import fluxapi.Api;
import fluxapi.request.CommonRequestHeader;

public class Demo {

	public static void main(String[] args) {
		Api.topupRequest.Builder topupRequestBuilder = Api.topupRequest.newBuilder();
		
		CommonRequestHeader.reqHeader.Builder regHeaderBuilder = CommonRequestHeader.reqHeader.newBuilder();
		regHeaderBuilder.setIdentity(UUID.randomUUID().toString());
		regHeaderBuilder.setSign(UUID.randomUUID().toString());
		regHeaderBuilder.setTimestamp(String.valueOf(System.currentTimeMillis()));
		regHeaderBuilder.setType(CommonRequestHeader.messageType.PROTO);
		topupRequestBuilder.setHeader(regHeaderBuilder);
		
		Api.topupRequest.payloadBody.Builder topupRequestPayloadBuilder = Api.topupRequest.payloadBody.newBuilder();
		topupRequestPayloadBuilder.setActiveflag(0);
		topupRequestPayloadBuilder.setExpiration(1);
		topupRequestPayloadBuilder.setFluxnum(1024);
		topupRequestPayloadBuilder.setMobile("18112715581");
		topupRequestPayloadBuilder.setOrderno(UUID.randomUUID().toString());
		topupRequestPayloadBuilder.setPcode("1024M");
		topupRequestPayloadBuilder.setScope(2);
		topupRequestPayloadBuilder.setUser("jason");
		topupRequestBuilder.setPayload(topupRequestPayloadBuilder);
		
		// Demo to write to output stream
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		try {
			topupRequestBuilder.build().writeTo(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Demo to read the output stream
		byte[] byteArray = output.toByteArray();
		ByteArrayInputStream input = new ByteArrayInputStream(byteArray);  
		try {
			Api.topupRequest request = Api.topupRequest.parseFrom(input);
			CommonRequestHeader.reqHeader header = request.getHeader();
			System.out.println(header.getIdentity());
			
			Api.topupRequest.payloadBody payload = request.getPayload();
			System.out.println(payload.getUser());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
