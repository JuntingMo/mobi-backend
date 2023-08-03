package com.mobi.springbootinit.manager;

import com.mobi.springbootinit.common.ErrorCode;
import com.mobi.springbootinit.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AiManager {
    @Resource
    private YuCongMingClient congMingClient;

    /**
     * AI对话测试
     *
     * @param modelId
     * @param message
     * @return
     */
    public String doChat(long modelId, String message) {
        DevChatRequest devChatRequest = new DevChatRequest();
        // 鱼聪明平台模型ID
        devChatRequest.setModelId(modelId);
        devChatRequest.setMessage(message);
        BaseResponse<DevChatResponse> response = congMingClient.doChat(devChatRequest);
        if (response == null) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "AI 响应错误");
        }
        return response.getData().getContent();
    }
}
