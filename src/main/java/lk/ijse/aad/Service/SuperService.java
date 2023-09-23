package lk.ijse.aad.Service;

import lk.ijse.aad.Dto.SuperDTO;
import lk.ijse.aad.Responce.Response;

public interface SuperService<T extends SuperDTO ,ID >{
    Response save(T t);

    Response update(T t);

    Response delete(ID id);

    Response search(ID id);

    Response getAll();

    Response createAndSendResponse(int statusCode, String message, Object data);
}
