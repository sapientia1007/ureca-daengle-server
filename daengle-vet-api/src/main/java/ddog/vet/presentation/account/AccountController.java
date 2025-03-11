package ddog.vet.presentation.account;

import ddog.auth.annotation.AuthPayload;
import ddog.auth.dto.PayloadDto;
import ddog.auth.exception.common.CommonResponseEntity;
import ddog.vet.application.AccountService;
import ddog.vet.presentation.account.dto.*;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static ddog.auth.exception.common.CommonResponseEntity.success;


@RestController
@RequestMapping("/api/vet")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/join")
    public CommonResponseEntity<SignUpResp> signUp(@RequestBody SignUpReq request, HttpServletResponse response) {
        return success(accountService.signUp(request, response));
    }

<<<<<<< HEAD
    @GetMapping("/profile")
    public CommonResponseEntity<ProfileInfo> getVetInfo(PayloadDto payloadDto) {
=======
    @GetMapping("/info")
    public CommonResponseEntity<ProfileInfo> getVetInfo(@AuthPayload PayloadDto payloadDto) {
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667
        return success(accountService.getVetInfo(payloadDto.getAccountId()));
    }

    @GetMapping("/modify-page")
    public CommonResponseEntity<ProfileInfo.UpdatePage> getModifyInfo(@AuthPayload PayloadDto payloadDto) {
        return success(accountService.getModifyPage(payloadDto.getAccountId()));
    }

<<<<<<< HEAD
    @PatchMapping("/profile")
    public CommonResponseEntity<AccountResp> updateInfo(@RequestBody UpdateInfo request, PayloadDto payloadDto) {
=======
    @PatchMapping("/info")
    public CommonResponseEntity<AccountResp> updateInfo(@RequestBody UpdateInfo request,
                                                        @AuthPayload PayloadDto payloadDto) {
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667
        return success(accountService.updateInfo(request, payloadDto.getAccountId()));
    }

    @GetMapping("/withdraw-info")
    public CommonResponseEntity<WithdrawInfoResp> getWithdrawInfo(@AuthPayload PayloadDto payloadDto) {
        return success(accountService.getWithdrawInfo(payloadDto.getAccountId()));
    }

<<<<<<< HEAD
    @DeleteMapping("/profile")
    public CommonResponseEntity<WithdrawResp> withdraw(PayloadDto payloadDto) {
=======
    @DeleteMapping("/info")
    public CommonResponseEntity<WithdrawResp> withdraw(@AuthPayload PayloadDto payloadDto) {
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667
        return success(accountService.withdraw(payloadDto.getAccountId()));
    }
}