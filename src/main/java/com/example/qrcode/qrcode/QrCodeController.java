package com.example.qrcode.qrcode;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/qrcode")
public class QrCodeController {

    private final QrCodeService qrCodeService;

    public QrCodeController(QrCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] generate(@RequestParam String text) throws Exception {
        return qrCodeService.generateQRCode(text, 250, 250);
    }
}

