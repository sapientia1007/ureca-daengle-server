package ddog.groomer.presentation.account;

import ddog.auth.annotation.AuthPayload;
import ddog.auth.dto.PayloadDto;
import ddog.auth.exception.common.CommonResponseEntity;
import ddog.domain.shop.dto.UpdateShopReq;
import ddog.groomer.application.AccountService;

import ddog.groomer.presentation.account.dto.*;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static ddog.auth.exception.common.CommonResponseEntity.success;


@RestController
@RequestMapping("/api/groomer")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/join")
    public CommonResponseEntity<SignUpResp> signUp(@RequestBody SignUpReq request, HttpServletResponse response) {
        return success(accountService.signUp(request, response));
    }

<<<<<<< HEAD
    @GetMapping("/profile")
    public CommonResponseEntity<ProfileInfo> getGroomerInfo(PayloadDto payloadDto) {
=======
    @GetMapping("/info")
    public CommonResponseEntity<ProfileInfo> getGroomerInfo(@AuthPayload PayloadDto payloadDto) {
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667
        return success(accountService.getGroomerInfo(payloadDto.getAccountId()));
    }

    @GetMapping("/modify-page")
    public CommonResponseEntity<ProfileInfo.UpdatePage> getUpdateInfo(@AuthPayload PayloadDto payloadDto) {
        return success(accountService.getUpdatePage(payloadDto.getAccountId()));
    }

<<<<<<< HEAD
    @PatchMapping("/profile")
    public CommonResponseEntity<AccountResp> updateInfo(@RequestBody UpdateInfoReq request, PayloadDto payloadDto) {
=======
    @PatchMapping("/info")
    public CommonResponseEntity<AccountResp> updateInfo(@RequestBody UpdateInfoReq request,
                                                        @AuthPayload PayloadDto payloadDto) {
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667
        return success(accountService.updateInfo(request, payloadDto.getAccountId()));
    }

    @GetMapping("/shop/info")
    public CommonResponseEntity<ShopInfo.UpdatePage> getShopInfo(@AuthPayload PayloadDto payloadDto) {
        return success(accountService.getShopInfo(payloadDto.getAccountId()));
    }

    @PatchMapping("/shop/info")
    public CommonResponseEntity<ShopInfo.UpdateResp> updateShopInfo(@RequestBody UpdateShopReq request) {
        return success(accountService.updateShopInfo(request));
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

    @GetMapping("/mypage/shop/{shopId}")
    public CommonResponseEntity<ShopDetailInfo> getBeautyShopDetail(@PathVariable Long shopId) {
        return success(accountService.findBeautyShop(shopId));
    }
}